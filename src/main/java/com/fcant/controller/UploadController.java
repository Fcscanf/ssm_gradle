package com.fcant.controller;

import com.fcant.bean.FilePo;
import com.fcant.bean.MutilFilePo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * UploadController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 20:28 2019-06-17/0017
 */
@Controller
@RequestMapping("/up")
public class UploadController {

    @RequestMapping("/onefile")
    public String upOneFile(FilePo filePo, HttpServletRequest request){
        String path = request.getServletContext().getRealPath("uploalfiles");
        String filename = filePo.getFile().getOriginalFilename();
        File targetFile = new File(path,filename);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        try {
            filePo.getFile().transferTo(targetFile);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  "hello";
    }

    @RequestMapping("/upone")
    public String upone(){
        return "upmulti";
    }

    /**
     * mutilFilePo规定是pojo类的首字母小写，不然前端界面接收不到
     *
     * @param
     * @return
     * @author Fcscanf
     * @date 下午 20:29 2019-06-17/0017
     */
    @RequestMapping("/multifiles")
    public String upMultiFile(@ModelAttribute("mutilFilePo") MutilFilePo mutilFilePo, HttpServletRequest request){
        String path = request.getServletContext().getRealPath("uploadfiles");
        File targetDir=new File(path);
        if(!targetDir.exists()){
            targetDir.mkdirs();
        }
        List<MultipartFile> files=mutilFilePo.getFiles();
        for(int i=0;i<files.size();i++){
            MultipartFile file=files.get(i);
            String fileName=file.getOriginalFilename();
            File targetFile=new File(path,fileName);
            try{
                if (file.getSize()==0)
                    continue;
                file.transferTo(targetFile);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return "fileinfo";

    }
}
