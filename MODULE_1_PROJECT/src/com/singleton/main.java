package com.singleton;

public class main {
    public static void main(String[] args) {
       
        ConfigurationManager configManager = ConfigurationManager.getInstance();

       
        configManager.setApiKey("mySecretApiKey");
        configManager.setMaxConnections(20);
        configManager.setServerHost("myserver.com");
        configManager.setServerPort(9090);

        
        configManager.displayConfiguration();

       
        ConfigurationManager anotherConfigManager = ConfigurationManager.getInstance();
        anotherConfigManager.displayConfiguration();  
  }
}
