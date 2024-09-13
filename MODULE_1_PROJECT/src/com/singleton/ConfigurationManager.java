package com.singleton;

public class ConfigurationManager {

   
    private static ConfigurationManager instance = null;

    
    private String apiKey;
    private int maxConnections;
    private String serverHost;
    private int serverPort;

   
    private ConfigurationManager() {
        
        apiKey = "defaultApiKey";
        maxConnections = 10;
        serverHost = "localhost";
        serverPort = 8080;
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

   
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

   
    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    
    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

   
    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

   
    public void displayConfiguration() {
        System.out.println("API Key: " + apiKey);
        System.out.println("Max Connections: " + maxConnections);
        System.out.println("Server Host: " + serverHost);
        System.out.println("Server Port: " + serverPort);
    }
}
