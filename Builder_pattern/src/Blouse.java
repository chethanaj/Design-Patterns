public class Blouse {

    private final String sleeve;
    private final String coller;
    private final String pocket;
    private final String button;


    public Blouse(Builder builder){
        this.button=builder.button;
        this.coller=builder.coller;
        this.pocket=builder.pocket;
        this.sleeve=builder.sleeve;
    }

    static class Builder{
        private String sleeve;
        private String coller;
        private String pocket;
        private String button;

        public Blouse build(){
            return new Blouse(this);
        }
        public Builder(){}

        public Builder sleeve(String sleeve){
            this.sleeve=sleeve;
            return this;
        }

        public Builder coller(String coller){
            this.coller=coller;
            return this;
        }

        public Builder pocket(String pocket){
            this.pocket=pocket;
            return this;
        }

        public Builder button(String button){
            this.button=button;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Blouse{" +
                "sleeve='" + sleeve + '\'' +
                ", coller='" + coller + '\'' +
                ", pocket='" + pocket + '\'' +
                ", button='" + button + '\'' +
                '}';
    }
}
