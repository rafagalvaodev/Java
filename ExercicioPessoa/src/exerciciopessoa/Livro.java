package exerciciopessoa;
public class Livro implements Publicacao{
   private String title;
   private String author;
   private int total_Pages;
   private int current_Page;
   private boolean open;
   private Pessoa reader;

    public Livro(String title, String author, int total_Pages, int corrent_Page, boolean open, Pessoa reader) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setTotal_Pages(total_Pages);
        this.setCurrent_Page(0);
        this.setOpen(false);
        this.setReader(reader);
        
    }

  
    public String details() {
        return "Livro{" + "title= " + title + "\n author= " + author + "\n total_Pages= " + total_Pages + "\n current_Page= " + current_Page + "\n open= " + open + "\n reader= " + reader.getName() + '}';
    
    
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotal_Pages() {
        return total_Pages;
    }

    public void setTotal_Pages(int total_Pages) {
        this.total_Pages = total_Pages;
    }

    public int getCurrent_Page() {
        return current_Page;
    }

    public void setCurrent_Page(int current_Page) {
        this.current_Page = current_Page;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Pessoa getReader() {
        return reader;
    }

    public void setReader(Pessoa reader) {
        this.reader = reader;
    }

    @Override
    public void open() {
        this.setOpen(true);
    }

    @Override
    public void close() {
        this.setOpen(false);
    }

    @Override
    public void leaf_Through(int page) {
        if (page > this.total_Pages) {
            this.setOpen(false);
            this.setCurrent_Page(0);
        } else {
            this.setCurrent_Page(page);
        }
        
    }

    @Override
    public void next_Page() {
        this.setCurrent_Page(this.getCurrent_Page()+ 1);
    }

    @Override
    public void back_Page() {
         this.setCurrent_Page(this.getCurrent_Page() -1);
    }
   
    
    
    
    
}
