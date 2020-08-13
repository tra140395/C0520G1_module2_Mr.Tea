package word;

public class Word {
    private String wordName;
    private String pronoun;
    private String noun;
    private String exampleOfNoun;
    private String adjective;
    private String exampleOfAdjective;
    private String verb;
    private String exampleOfVerb;
    private String similar;

    public Word(){

    }

    public Word(String wordName, String pronoun, String noun, String exampleOfNoun, String adjective,
                String exampleOfAdjective, String verb, String exampleOfVerb, String similar) {
        this.wordName = wordName;
        this.pronoun = pronoun;
        this.noun = noun;
        this.exampleOfNoun = exampleOfNoun;
        this.adjective = adjective;
        this.exampleOfAdjective = exampleOfAdjective;
        this.verb = verb;
        this.exampleOfVerb = exampleOfVerb;
        this.similar = similar;
    }

    public String getWordName() {
        return wordName;
    }

    public void setWordName(String wordName) {
        this.wordName = wordName;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getExampleOfNoun() {
        return exampleOfNoun;
    }

    public void setExampleOfNoun(String exampleOfNoun) {
        this.exampleOfNoun = exampleOfNoun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getExampleOfAdjective() {
        return exampleOfAdjective;
    }

    public void setExampleOfAdjective(String exampleOfAdjective) {
        this.exampleOfAdjective = exampleOfAdjective;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getExampleOfVerb() {
        return exampleOfVerb;
    }

    public void setExampleOfVerb(String exampleOfVerb) {
        this.exampleOfVerb = exampleOfVerb;
    }

    public String getSimilar() {
        return similar;
    }

    public void setSimilar(String similar) {
        this.similar = similar;
    }

    @Override
    public String toString() {
        return "@@@@@ Action: Lookup "+ wordName +'\n'+
                "* Phát âm: " + pronoun + '\n' +
                "* Danh từ: " + noun + '\'' +
                " - Ví dụ: " + exampleOfNoun + '\n' +
                "* Tính từ: " + adjective + '\'' +
                " - Ví dụ: " + exampleOfAdjective + '\n' +
                "* Động từ: " + verb + '\'' +
                " - Ví dụ: " + exampleOfVerb + '\n' +
                "* Tương đồng: " + similar +"\n";
    }
}
