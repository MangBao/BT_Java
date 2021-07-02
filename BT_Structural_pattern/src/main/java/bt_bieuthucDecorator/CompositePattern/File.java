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
public class File extends AbstractFile{

    public File(String string, String string1) {
        super(string, string1);
    }

    @Override
    public void add(AbstractFile file) {
    }

    @Override
    public void remove(AbstractFile file) {
    }

    @Override
    public String getStringTreeFolder() {
        return this.preStr + name;
    }
    
}
