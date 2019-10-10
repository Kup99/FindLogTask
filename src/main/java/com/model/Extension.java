package com.model;

/**
 * Created by 813632 on 26.08.2019.
 */
public class Extension {

    public static String getExtension(String extension) {
        switch (extension) {
            case "TXT":
                return ".txt";
            case "LOG":
                return ".log";
            default:
                return "default";
        }}}
