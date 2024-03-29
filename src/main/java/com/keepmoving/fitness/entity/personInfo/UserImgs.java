package com.keepmoving.fitness.entity.personInfo;



import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

//@Entity
//@Table(name = "user_imgs")
@Component
public class UserImgs implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_imgs.id
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
//    @Id
//    @GeneratedValue
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_imgs.user_id
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_imgs.create_time
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_imgs.img_url
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    private String imgUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_imgs
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    private static final long serialVersionUID = 1L;

    public UserImgs() {
    }

    public UserImgs(Integer id, Long userId, Date createTime, String imgUrl) {
        this.id = id;
        this.userId = userId;
        this.createTime = createTime;
        this.imgUrl = imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_imgs.id
     *
     * @return the value of user_imgs.id
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_imgs.id
     *
     * @param id the value for user_imgs.id
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_imgs.user_id
     *
     * @return the value of user_imgs.user_id
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_imgs.user_id
     *
     * @param userId the value for user_imgs.user_id
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_imgs.create_time
     *
     * @return the value of user_imgs.create_time
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_imgs.create_time
     *
     * @param createTime the value for user_imgs.create_time
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_imgs.img_url
     *
     * @return the value of user_imgs.img_url
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_imgs.img_url
     *
     * @param imgUrl the value for user_imgs.img_url
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_imgs
     *
     * @mbggenerated Sat Sep 28 08:43:04 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", createTime=").append(createTime);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}