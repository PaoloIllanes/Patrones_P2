package command.ejemplo;

public class Client {
    public static void main (String[]args){
        Ide intelliJ = new Ide();
        intelliJ.setName("intellij idea").setType("community").setVersion("2023");

        GenerateBuild generateBuild= new GenerateBuild(intelliJ);
        CompileStandarization compileStandarization= new CompileStandarization(intelliJ);
        CleanBuildFolder cleanBuildFolder = new CleanBuildFolder(intelliJ);
        RunTest runTest = new RunTest(intelliJ);


        MakeBuild makeBuild= new MakeBuild();


        makeBuild.addCommand(cleanBuildFolder);
        makeBuild.addCommand(runTest);
        makeBuild.addCommand(compileStandarization);
        makeBuild.addCommand(generateBuild);


        makeBuild.makeBuildCmd();








    }

}
