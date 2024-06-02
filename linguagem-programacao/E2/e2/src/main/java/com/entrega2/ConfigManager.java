package com.entrega2;

import java.io.*;
import java.util.Properties;

public class ConfigManager {

    private static final String CONFIG_FILE = System.getProperty("user.dir") + File.separator + "config.properties";

    public static void writeConfig(String username, String password) {
        try (OutputStream output = new FileOutputStream(CONFIG_FILE)) {
            Properties prop = new Properties();
            prop.setProperty("username", username);
            prop.setProperty("password", password);
            prop.store(output, null);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static String[] readConfig() {
        String[] credentials = new String[2];
        try (InputStream input = new FileInputStream(CONFIG_FILE)) {
            Properties prop = new Properties();
            prop.load(input);
            credentials[0] = prop.getProperty("username");
            credentials[1] = prop.getProperty("password");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return credentials;
    }
}