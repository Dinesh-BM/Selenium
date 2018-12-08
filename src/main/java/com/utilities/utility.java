package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utility 
{
public static String getprop(String key) throws IOException
{
FileInputStream fi=new FileInputStream("./src/main/resources/com/proprties/file/config.properties");
Properties p=new Properties();
p.load(fi);
return p.getProperty(key);
}
}
