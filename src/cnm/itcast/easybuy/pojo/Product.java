package cnm.itcast.easybuy.pojo;

public class Product {
    private Integer id;//主键
    private String name;//名称
    private String  description;//描述
    private  Float price;//价格
    private Integer stock;//库存
    private Integer categoryLevel1Id;//分类1
    private  Integer categoryLevel2Id;//分类2
    private Integer categoryLevel3Id;//分类3
    private String  fileName;//文件名称
    private Integer isDelete;//是否删除（1：删除 0：未删除）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategoryLevel1Id() {
        return categoryLevel1Id;
    }

    public void setCategoryLevel1Id(Integer categoryLevel1Id) {
        this.categoryLevel1Id = categoryLevel1Id;
    }

    public Integer getCategoryLevel2Id() {
        return categoryLevel2Id;
    }

    public void setCategoryLevel2Id(Integer categoryLevel2Id) {
        this.categoryLevel2Id = categoryLevel2Id;
    }

    public Integer getCategoryLevel3Id() {
        return categoryLevel3Id;
    }

    public void setCategoryLevel3Id(Integer categoryLevel3Id) {
        this.categoryLevel3Id = categoryLevel3Id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
