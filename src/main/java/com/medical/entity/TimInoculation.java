package com.medical.entity;

    import java.time.LocalDateTime;
    import java.io.Serializable;
    import java.util.List;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 预约疫苗
    * </p>
*
* @author JiaJieTang
* @since 2022-08-11
*/
    @Data
        @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public class TimInoculation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private int id;
            /**
            * 预约时间;
            */
    private LocalDateTime time;

            /**
            * 疫苗id
            */
    private Integer vid;

            /**
            * 用户id
            */
    private Integer uid;

            /**
            * 医院id
            */
    private Integer hid;

    private List<Vaccine> vaccines;
    private List<User> users;
    private List<Hospital> hospitals;


}
