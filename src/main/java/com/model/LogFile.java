package com.model;

import java.util.List;

/**
 * Created by 813632 on 27.09.2019.
 */
public class LogFile {
    private String logText;
    private String path;
    private String file_extension;
    
    public LogFile() {
    }


    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFile_extension() {
        return file_extension;
    }
    
    public void setFile_extension(String file_extension) {
        this.file_extension = file_extension;
    }




}
