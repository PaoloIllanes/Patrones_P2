package memento.example;

public class Code {
    private String codeLines;
    private String comentarios;
    private String hash;
    private boolean isStoryComplete;

    public Code(String codeLines,String comentarios,String hash,boolean isStoryComplete){
        this.codeLines=codeLines;
        this.comentarios=comentarios;
        this.hash=hash;
        this.isStoryComplete=isStoryComplete;

    }

    public String getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(String codeLines) {
        this.codeLines = codeLines;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public boolean isStoryComplete() {
        return isStoryComplete;
    }

    public void setStoryComplete(boolean storyComplete) {
        isStoryComplete = storyComplete;
    }

    public void showInfo(){
        System.out.println("********************************");
        System.out.println("Codelines: "+codeLines);
        System.out.println("Comentarios: "+comentarios);
        System.out.println("Hash: "+hash);
        System.out.println("Story complete: "+isStoryComplete);

    }
}
