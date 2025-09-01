package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class AppSettings implements Serializable {
    private static volatile AppSettings instance; // volatile for double-checked locking
    private final Properties props = new Properties();

    // Private constructor
    private AppSettings() {
        // Reflection guard
        if (instance != null) {
            throw new IllegalStateException("Cannot create a second instance of AppSettings");
        }
    }

    // Thread-safe lazy singleton
    public static AppSettings getInstance() {
        if (instance == null) {
            synchronized (AppSettings.class) {
                if (instance == null) {
                    instance = new AppSettings();
                }
            }
        }
        return instance;
    }

    // Load properties from file
    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
            System.out.println("DEBUG: loaded properties = " + props);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }

    // Serialization-safe singleton
    private Object readResolve() {
        return getInstance();
    }
}
