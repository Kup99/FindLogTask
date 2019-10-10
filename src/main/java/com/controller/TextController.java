package com.controller;

import com.model.Extension;
import com.model.LogFile;
import com.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class TextController {
    @Autowired
    TextService textService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage(){

        return "index";
    }

    @RequestMapping(value = "/getFile", method = RequestMethod.GET)
    public String getFile(LogFile logFile,ModelMap model) throws IOException{
        logFile.setFile_extension(Extension.getExtension(logFile.getFile_extension()));
        List<File> fileList=textService.getLogFiles(logFile);
        if (fileList.isEmpty()){
            model.addAttribute("file","file not found");
            return "index";
        }
        model.addAttribute("log_list",fileList);
        model.addAttribute("quantity",fileList.size());
        return "logs";
    }


    @RequestMapping(value = "/getText", method = RequestMethod.GET)
    public String getTextFromFile(@RequestParam("path") String path,ModelMap model) throws IOException{
        model.addAttribute("text",textService.getText(path));
        return "text";
    }


}


