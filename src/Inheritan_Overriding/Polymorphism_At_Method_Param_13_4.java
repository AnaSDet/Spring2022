package Inheritan_Overriding;

public class Polymorphism_At_Method_Param_13_4 {
    public static void main(String[] args) { //1.
        Browser chrome = new Chrome();//19. passing Chrome object
         openWebsiteFromAnyBrowser(chrome, "google.com");//20.
System.out.println("===========================================================================================");
        Browser saf = new Safari();//21. passing Safari object
        openWebsiteFromAnyBrowser(saf, "safari.com");//22.
    }
    //17. creating a static method bc we want to be able to openWebsite from any browser
    public static void openWebsiteFromAnyBrowser(Browser browser, String url){ //passing a browser from parent class. This method call Polymorphism method parameter!!!!!
       browser.OpenWebsite(url);  //18.!!!!!!!!!!
    }
}

//create a program that will dynamically create browsers
//I have Chrome and Safari Browsers. All Browsers should have common method like OpenWebsite(String url) -> Opening website in Chrome/Safari
//Chrome should have clearCache()
//Safari should have privateBrowsing()


class Browser{ //2. parent lass
     public void OpenWebsite(String url){ //5. method
        System.out.println("Opening Website in a genetic Browser"); //10.
     }
}

class Chrome extends Browser{ //3. 1st child class
    @Override //8.
    public void OpenWebsite(String url){ //6. method
        System.out.println("Opening Website in a Chrome Browser"); //11.
    }
    public void clearCache(){ //13. method that belongs only to Chrome
        System.out.println("Cleaning cache in Chrome Browser"); //14.
    }
}

class Safari extends Browser{ //4. 2nd child class
    @Override //9.
    public void OpenWebsite(String url){ //7. method
        System.out.println("Opening Website in a Safari Browser"); //12.
    }
    public void privateBrowsing(){ //15. method that belongs only to Safari
        System.out.println("PrivatelyBrowsing in Safari"); //16.
    }
}