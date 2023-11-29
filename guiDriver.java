public class guiDriver {
    public static void main(String[] args) {
        EvolandiaModel evolandiaModel = new EvolandiaModel();
        EvolandiaView evolandiaView = new EvolandiaView(evolandiaModel);
        EvolandiaController evolandiaController = new EvolandiaController(evolandiaView, evolandiaModel);

    }
    
}