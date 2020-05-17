public class Application {

    public static void main(String[] args) {

        Blouse.Builder builder=new Blouse.Builder();
        Blouse blouse= builder.button("Shank").coller("Shawl collar").pocket("Applied pocket").build();
        System.out.println(blouse);
    }
}
