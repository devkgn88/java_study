package com.gn.practice01;

import java.io.File;

public class Practice {
	public void deleteFile(File dir) {
		if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if(file.delete()) {
                    	System.out.println(file.getName()+" 파일 삭제");
                    }
                }
            }
        }
	}
}
