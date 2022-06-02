package memento.example;

public class Client {

    public static void main(String[]args){

        Github github = new Github();
        Git git = new Git();
        Code code;
        code = new Code("public interface","//Storie no terminada","abc123",false);
        code = new Code("public abstract","//Storie terminada","cdf456",true);
        git.setCommit(code);
        github.addCommit(git.createCommit());
        code = new Code("protected interface","//Storie no terminada","hij890",false);
        code = new Code("private interface","//Storie terminada","rtx546",true);
        code = new Code("protected interface","//Storie terminada","hij890",true);
        git.setCommit(code);
        github.addCommit(git.createCommit());
        code = new Code("private interface","//Storie terminada","rtx546",true);

        code = github.getCommit("cdf456").getState();
        code.showInfo();

    }

}
