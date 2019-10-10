package com.service;
import com.model.LogFile;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class TextServiceImpl implements TextService  {

    @Override
    public List<File> getLogFiles(LogFile logFile) throws IOException {
        return Files.walk(Paths.get(logFile.getPath())).filter(Files::isRegularFile).
                filter(p->p.toString().endsWith(logFile.getFile_extension())).
                filter(p->{
                    try {
                        String content = new String(Files.readAllBytes(p));
                        if (content.contains(logFile.getLogText())) {
                            return true;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }).map(Path::toFile).collect(Collectors.toList());}

    @Override
    public List<String> getText(String path) {

        List<String> lines = new ArrayList<>();
        Path getPath = Paths.get(path);

        try (Stream<String> lineStream = Files.newBufferedReader(getPath).lines()) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException ignored) {
        }

        return lines;

    }
}
