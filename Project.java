import java.util.*;

class Project {
    private String province;
    private boolean[] options = new boolean[7];
    private String name;
    private String stage;
    private String location;
    
    public Project(String province, boolean[] options, String name, String stage, String location) {
        this.province = province;
        this.options = Arrays.copyOf(options, options.length);
        this.name = name;
        this.stage = stage;
        this.location = location;
    }
    
    public String getProvince() {
        return province;
    }
    
    public boolean[] getOptions() {
        return Arrays.copyOf(options, options.length);
    }
    
    public String getName() {
        return name;
    }
    
    public String getStage() {
        return stage;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    
    public void setStage(String stage) {
        if (stage.equals("on going") || stage.equals("completed")) {
            this.stage = stage;
        } else {
            System.out.println("Invalid stage value. Please provide 'on going' or 'completed'.");
        }
    }
    
    public void setOptions(boolean[] options) {
        this.options = Arrays.copyOf(options, options.length);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
}
