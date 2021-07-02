/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_bieuthucDecorator.CompositePattern;

/**
 *
 * @author ASUS
 */
public abstract class AbstractFile {
    String name, dayCreate;
    String path;
    String preStr ="";
    
    public AbstractFile(String name, String dayCreate) {
        this.name = name;
        this.dayCreate = dayCreate;
        this.path = name;
    }
    
    abstract public void add(AbstractFile file);
    abstract public void remove(AbstractFile file);
    abstract public String getStringTreeFolder();

    public String getPath() {
        return path;
    }
    
}
