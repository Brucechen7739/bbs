package cc.javaee.bbs.model;

public class UserLiuyan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jbbs_user_liuyan.id
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    private Integer id;

    //留言的用户id
    private Integer liuyanuserid;

    //创建人id
    private Integer createuserid;

    //创建时间
    private String createtime;

    //内容
    private String contenthtml;

    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_user_liuyan.id
     *
     * @param id the value for jbbs_user_liuyan.id
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_user_liuyan.liuyanuserid
     *
     * @return the value of jbbs_user_liuyan.liuyanuserid
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public Integer getLiuyanuserid() {
        return liuyanuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_user_liuyan.liuyanuserid
     *
     * @param liuyanuserid the value for jbbs_user_liuyan.liuyanuserid
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public void setLiuyanuserid(Integer liuyanuserid) {
        this.liuyanuserid = liuyanuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_user_liuyan.createuserid
     *
     * @return the value of jbbs_user_liuyan.createuserid
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public Integer getCreateuserid() {
        return createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_user_liuyan.createuserid
     *
     * @param createuserid the value for jbbs_user_liuyan.createuserid
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_user_liuyan.createtime
     *
     * @return the value of jbbs_user_liuyan.createtime
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_user_liuyan.createtime
     *
     * @param createtime the value for jbbs_user_liuyan.createtime
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jbbs_user_liuyan.contenthtml
     *
     * @return the value of jbbs_user_liuyan.contenthtml
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public String getContenthtml() {
        return contenthtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jbbs_user_liuyan.contenthtml
     *
     * @param contenthtml the value for jbbs_user_liuyan.contenthtml
     *
     * @mbggenerated Fri Jun 23 14:22:55 CST 2017
     */
    public void setContenthtml(String contenthtml) {
        this.contenthtml = contenthtml;
    }
}