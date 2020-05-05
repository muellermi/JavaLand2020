package de.muellerbruehl.jsfclass.playground;

import de.muellerbruehl.jsfclass.common.Page;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Named
@ViewScoped
public class Loop implements Serializable {

    public List<String> getPageNames(){
        return Arrays.stream(Page.values()).map(page -> page.name()).collect(Collectors.toList());
    }

    public List<Page> getPages(){
        return Arrays.stream(Page.values()).collect(Collectors.toList());
    }
}
