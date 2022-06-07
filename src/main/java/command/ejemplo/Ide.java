package command.ejemplo;

public class Ide {
    private String name;
    private String version;
    private String type;

    public Ide(){
    }

    public String getName() {
        return name;
    }

    public Ide setName(String name) {
        this.name = name;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Ide setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getType() {
        return type;
    }

    public Ide setType(String type) {
        this.type = type;
        return this;
    }

    public void removenBuildFolder(){
        System.out.println("remove build folder");
    }

    public void cleanBuildFolder(){

        System.out.println("create build folder");
    }
    public void runUnitTest(){
        System.out.println("run unit test. ..");
        System.out.println("run unit test complete");
    }
    public void compileStandarizationCode(){
        System.out.println("compiling. ..");
        System.out.println("compiling complete");
    }

    public void generateBuild(){
        System.out.println("creating JAR file");
    }

}
