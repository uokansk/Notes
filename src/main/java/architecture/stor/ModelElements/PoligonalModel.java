package architecture.stor.ModelElements;

import java.util.Collection;

public class PoligonalModel {
    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    private Collection<Poligon> poligons;

    private Collection<Texture> textures;

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }

}
