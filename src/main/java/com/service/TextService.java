package com.service;
import com.model.LogFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by 813632 on 27.09.2019.
 */
public interface TextService {

     List<File> getLogFiles(LogFile logFile) throws IOException;

     List<String> getText(String path);



}
