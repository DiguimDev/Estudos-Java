package academy.devdojo.maratonajava.javacore.Zoptional.dominio;

public class Manga {
    private Integer id;
    private String title;
    private int chapters;

    public Manga(Integer id, int chapters, String title) {
        this.id = id;
        this.chapters = chapters;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getChapters() {
        return chapters;
    }
}
