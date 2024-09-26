    import java. io.FileReader;
    import java. io. IOException;

    class FileReaderD {
        private String filePath;
        public FileReaderD (String filePath){
        this.filePath = filePath;
    }

    public void readerFile(){
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(filePath);
            int character;
            while ((character = fileReader.read()) != -1){
            System.out.println((char)character);
            }
        }
        catch (IOException e){
            System.out.println("Error: An I/O error occurred while reading the file.");
        } 
        finally{
            try{
            if (fileReader != null){
                fileReader.close();
            }
        }catch (IOException e) {
            System.out.println("Error: An I/O error occurred while closing the file.");
        }
    }
        }
    }

    class FileReaderApp {
        public static void main(String[] args) {
            String filePath = "koschie.txt";
            FileReaderD fileReaderD = new FileReaderD(filePath);

            try {
                System.out.println(" Reading data from file.");
                fileReaderD.readerFile();
            } catch (Exception e) {
                System.out.println("Error: An unexpected error occured.");
                
            }
        }
    }
