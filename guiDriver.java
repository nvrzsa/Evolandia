public class guiDriver {
    public static void main(String[] args) {
        EvolandiaView evolandiaView = new EvolandiaView();
        EvolandiaModel evolandiaModel = new EvolandiaModel();

        EvolandiaController evolandiaController = new EvolandiaController(evolandiaView, evolandiaModel);
    }
}