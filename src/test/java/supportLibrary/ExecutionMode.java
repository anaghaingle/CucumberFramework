package supportLibrary;

public enum ExecutionMode {

	LOCAL("Local"), 
    MOBILE("Mobile");
 
    private String mode;
 
    ExecutionMode(String mode) {
        this.mode = mode;
    }
 
    public String getbrowser() {
        return mode;
    }
}
