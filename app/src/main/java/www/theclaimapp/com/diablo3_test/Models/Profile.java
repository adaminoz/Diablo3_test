package www.theclaimapp.com.diablo3_test.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Profile {

    @Expose
    private Integer paragonLevel;
    @Expose
    private Boolean seasonal;
    @Expose
    private String name;
    @Expose
    private Integer id;
    @Expose
    private Integer level;
    @Expose
    private Boolean hardcore;
    @Expose
    private Integer gender;
    @Expose
    private Boolean dead;
    @SerializedName("class")
    @Expose
    private String _class;
    @SerializedName("last-updated")
    @Expose
    private Integer lastUpdated;
    @Expose
    private String battleTag;


    /**
     *
     * @return
     * The paragonLevel
     */
    public Integer getParagonLevel() {
        return paragonLevel;
    }

    /**
     *
     * @param paragonLevel
     * The paragonLevel
     */
    public void setParagonLevel(Integer paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    /**
     *
     * @return
     * The seasonal
     */
    public Boolean getSeasonal() {
        return seasonal;
    }

    /**
     *
     * @param seasonal
     * The seasonal
     */
    public void setSeasonal(Boolean seasonal) {
        this.seasonal = seasonal;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     *
     * @param level
     * The level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     *
     * @return
     * The hardcore
     */
    public Boolean getHardcore() {
        return hardcore;
    }

    /**
     *
     * @param hardcore
     * The hardcore
     */
    public void setHardcore(Boolean hardcore) {
        this.hardcore = hardcore;
    }

    /**
     *
     * @return
     * The gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     *
     * @param gender
     * The gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     *
     * @return
     * The dead
     */
    public Boolean getDead() {
        return dead;
    }

    /**
     *
     * @param dead
     * The dead
     */
    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    /**
     *
     * @return
     * The _class
     */
    public String getClass_() {
        return _class;
    }

    /**
     *
     * @param _class
     * The class
     */
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     *
     * @return
     * The lastUpdated
     */
    public Integer getLastUpdated() {
        return lastUpdated;
    }

    /**
     *
     * @param lastUpdated
     * The last-updated
     */
    public void setLastUpdated(Integer lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }

}