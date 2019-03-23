package by.vasili.khalko.toss.model;

public abstract class AbstractBaseEntity {

    private Integer id;

    AbstractBaseEntity(){}

    AbstractBaseEntity(Integer id){
        this.id = id;
    }

    Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isNew(){
        return this.id == null;
    }

    @Override
    public String toString() {
        return String.format("Entity %s (%d)", getClass().getName(), id);
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        AbstractBaseEntity that = (AbstractBaseEntity) obj;
        return id != null && id.equals(that.id);
    }
}
