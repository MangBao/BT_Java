/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_bieuthucDecorator.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Folder extends AbstractFile{

    List<AbstractFile> list = new ArrayList<>();
    
    public Folder(String name, String dayCreate) {
        super(name, dayCreate);
    }

    @Override
    public void add(AbstractFile file) {
        if (!list.contains(file)) {
            list.add(file);
            file.path = file.name;
            file.path = this.path + "\\" +file.path;
        }
    }

    @Override
    public void remove(AbstractFile file) {
        if (list.contains(file)) {
            list.remove(file);
            return;
        }
        for ( AbstractFile folder : list) {
            folder.remove(file);
        }
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(preStr).append(name);
        for (AbstractFile f: list) {
            f.preStr = this.preStr +"..";
            builder.append("\n").append(f.getStringTreeFolder());
            f.preStr ="";
        }
        return builder.toString();
    } 
    
}
