package group.ydq.model.entity.cs;

import group.ydq.model.entity.dm.Project;
import group.ydq.model.entity.rbac.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * author:Leo
 * date:2018/11/12
 */
@Entity
public class CheckStage {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Project project;

    private int stage;  //项目所处阶段（中期或者后期）    1-中期检查    2-结题验收

    private Date startTime;

    private Date endTime;

    private int status;  // 所处阶段审核状态 0-未审核   1-已通过   2-未通过

    private String remarks; //项目上传材料要求

    private  String message; //项目阶段审核建议

    @ManyToOne
    private User verifiers;//审核人

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public User getVerifiers() {
        return verifiers;
    }

    public void setVerifiers(User verifiers) {
        this.verifiers = verifiers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
