package vn.com.ecopharma.hrm.tt.bean;

import java.io.Serializable;

import vn.com.ecopharma.hrm.tt.utils.TTUtils;

import com.liferay.portal.kernel.search.SearchContext;

public class BaseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	protected SearchContext getSearchContext() {
		return TTUtils.getCurrentSearchContext();
	}
}
