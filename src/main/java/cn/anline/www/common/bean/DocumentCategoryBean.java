package cn.anline.www.common.bean;

import act.db.morphia.MorphiaModel;
import org.mongodb.morphia.annotations.Entity;

/**
 * 文档分类模型
 */
@Entity("document_category")
public class DocumentCategoryBean extends MorphiaModel<DocumentCategoryBean> {
}
