package com.amarsoft.app.service.util;

import com.amarsoft.app.service.serviceimpl.ActionListImpl;
import com.amarsoft.app.service.serviceimpl.ApplyDetaiLineImpl;
import com.amarsoft.app.service.serviceimpl.ApplyDetaiLineInfoImpl;
import com.amarsoft.app.service.serviceimpl.ApplyDetailImpl;
import com.amarsoft.app.service.serviceimpl.ApplyListImpl;
import com.amarsoft.app.service.serviceimpl.AppointAssigneeListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveAssignListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveClassifyTaskInfoImpl;
import com.amarsoft.app.service.serviceimpl.ApproveClassifyTaskListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveClassifyTaskSubmitImpl;
import com.amarsoft.app.service.serviceimpl.ApproveClassifyTaskTreeImpl;
import com.amarsoft.app.service.serviceimpl.ApproveClassifyTaskUserListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveDetailImpl;
import com.amarsoft.app.service.serviceimpl.ApproveListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveOldDetailImpl;
import com.amarsoft.app.service.serviceimpl.ApproveQueryListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveReplyInfoImpl;
import com.amarsoft.app.service.serviceimpl.ApproveReplyListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveRiskSignalTaskListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveScaleInfoImpl;
import com.amarsoft.app.service.serviceimpl.ApproveScaleInfoUpdateRateImpl;
import com.amarsoft.app.service.serviceimpl.ApproveScaleListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveSubmitImpl;
import com.amarsoft.app.service.serviceimpl.ApproveWorkSchemeInfoImpl;
import com.amarsoft.app.service.serviceimpl.ApproveWorkSchemeListImpl;
import com.amarsoft.app.service.serviceimpl.ApproveWorkSchemeOpinionImpl;
import com.amarsoft.app.service.serviceimpl.ApproveWorkSchemeSubmitCheckImpl;
import com.amarsoft.app.service.serviceimpl.ApproveWorkSchemeSubmitImpl;
import com.amarsoft.app.service.serviceimpl.ApproveWorkSchemeUserListImpl;
import com.amarsoft.app.service.serviceimpl.AssigneeListImpl;
import com.amarsoft.app.service.serviceimpl.AttachmentUploadImageImpl;
import com.amarsoft.app.service.serviceimpl.BackStepImpl;
import com.amarsoft.app.service.serviceimpl.BusinessDubillListImpl;
import com.amarsoft.app.service.serviceimpl.BusinessQueryInfoImpl;
import com.amarsoft.app.service.serviceimpl.BusinessQueryListImpl;
import com.amarsoft.app.service.serviceimpl.CheckEvaluateImpl;
import com.amarsoft.app.service.serviceimpl.CustomerEditImpl;
import com.amarsoft.app.service.serviceimpl.CustomerInspectAddApplyImpl;
import com.amarsoft.app.service.serviceimpl.CustomerInspectInitImpl;
import com.amarsoft.app.service.serviceimpl.CustomerInspectInitImpl2;
import com.amarsoft.app.service.serviceimpl.CustomerInspectListImpl;
import com.amarsoft.app.service.serviceimpl.CustomerInspectPhotoChildImpl;
import com.amarsoft.app.service.serviceimpl.CustomerInspectPhotoTreeImpl;
import com.amarsoft.app.service.serviceimpl.CustomerInspectSelectCustomerImpl;
import com.amarsoft.app.service.serviceimpl.CustomerListImpl;
import com.amarsoft.app.service.serviceimpl.CustomerSaveImpl;
import com.amarsoft.app.service.serviceimpl.ElementApproveInfoImpl;
import com.amarsoft.app.service.serviceimpl.ElementApproveListImpl;
import com.amarsoft.app.service.serviceimpl.FlowTaskSubmitRoleImpl;
import com.amarsoft.app.service.serviceimpl.GetNextPhaseImpl;
import com.amarsoft.app.service.serviceimpl.GetRandomCodeImpl;
import com.amarsoft.app.service.serviceimpl.LoadAudioTabImpl;
import com.amarsoft.app.service.serviceimpl.LogonImpl;
import com.amarsoft.app.service.serviceimpl.MemoDeleteImpl;
import com.amarsoft.app.service.serviceimpl.MemoDetailImpl;
import com.amarsoft.app.service.serviceimpl.MemoEditImpl;
import com.amarsoft.app.service.serviceimpl.MemoListImpl;
import com.amarsoft.app.service.serviceimpl.MemoSaveImpl;
import com.amarsoft.app.service.serviceimpl.MemoUpdateImpl;
import com.amarsoft.app.service.serviceimpl.NoteDetailImpl;
import com.amarsoft.app.service.serviceimpl.NoteListImpl;
import com.amarsoft.app.service.serviceimpl.OpinionEditImpl;
import com.amarsoft.app.service.serviceimpl.OpinionListImpl;
import com.amarsoft.app.service.serviceimpl.OpinionSaveButApplyImpl;
import com.amarsoft.app.service.serviceimpl.OpinionSaveImpl;
import com.amarsoft.app.service.serviceimpl.OpinionSignInfoImpl;
import com.amarsoft.app.service.serviceimpl.OrleInfoImpl;
import com.amarsoft.app.service.serviceimpl.PhaseListImpl;
import com.amarsoft.app.service.serviceimpl.PrePayApproveInfoImpl;
import com.amarsoft.app.service.serviceimpl.PrePayApproveListImpl;
import com.amarsoft.app.service.serviceimpl.PutoutListImpl;
import com.amarsoft.app.service.serviceimpl.RateQueryImpl;
import com.amarsoft.app.service.serviceimpl.ReportInfoImpl;
import com.amarsoft.app.service.serviceimpl.RiskClassifySaveOpinionImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalApplyInfoImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalApplyListImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalApplySaveImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalApplySelectCustomerImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalApplySelectRiskImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalAttachmentDeleteImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalAttachmentListImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalAttachmentPicDeleteImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalAttachmentUpLoadImpl;
import com.amarsoft.app.service.serviceimpl.RiskSignalLoanListImpl;
import com.amarsoft.app.service.serviceimpl.SignOpinionButApplyImpl;
import com.amarsoft.app.service.serviceimpl.SteptypeCodeImpl;
import com.amarsoft.app.service.serviceimpl.TakeBackImpl;
import com.amarsoft.app.service.serviceimpl.UserLeaveIdentCodeImpl;
import com.amarsoft.app.service.serviceimpl.UserLeaveListImpl;
import com.amarsoft.app.service.serviceimpl.UserLeaveSaveImpl;
import com.amarsoft.app.service.serviceimpl.WorkApproveQueryImpl;
import com.amarsoft.app.service.serviceimpl.WorkFlowQueryImpl;
import com.amarsoft.app.service.serviceimpl.WorktipsImpl;
import com.amarsoft.awe.util.json.JSONObject;
import com.amarsoft.mobile.webservice.business.HandlerException;

/**
 * 接口服务端实现
 * @author ljzhong
 * @param 2016/07/07
 *
 */
public class InterfaceServiceUtil {

	/**
	 * 用户登录验证
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject logon(JSONObject request) {
		LogonImpl logon = new LogonImpl();
		JSONObject result = new JSONObject();
		result = logon.logon(request);
		return result;
	}
	
	/**
	 * 工作台接口
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject worktips(JSONObject request) {
		JSONObject result = new JSONObject();
		WorktipsImpl worktips = new WorktipsImpl();
		result = worktips.worktips(request);
		return result;
	}
	/**
	 * 客户列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerlist(JSONObject request) {
		CustomerListImpl customerlist = new CustomerListImpl();
		JSONObject result = new JSONObject();
		result = customerlist.customerlist(request);
		return result;
	}
	/**
	 * 客户详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerEdit(JSONObject request) {
		CustomerEditImpl customerEdit = new CustomerEditImpl();
		JSONObject result = new JSONObject();
		result = customerEdit.customerEdit(request);
		return result;
	}
	/**
	 * 陌生客户保存
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerSave(JSONObject request) {
		CustomerSaveImpl customerSave = new CustomerSaveImpl();
		JSONObject result = new JSONObject();
		result = customerSave.customerSave(request);
		return result;
	}
	/**
	 * 未结清授信业务授信额度信息
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject businessDubillList(JSONObject request) {
		BusinessDubillListImpl businessDubillList = new BusinessDubillListImpl();
		JSONObject result = new JSONObject();
		result = businessDubillList.businessDubillList(request);
		return result;
	}
	/**
	 * 业务查询列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject businessQueryList(JSONObject request) {
		BusinessQueryListImpl businessQueryList = new BusinessQueryListImpl();
		JSONObject result = new JSONObject();
		result = businessQueryList.businessQueryList(request);
		return result;
	}
	/**
	 * 业务查询详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject businessQueryInfo(JSONObject request) {
		BusinessQueryInfoImpl businessQueryInfo = new BusinessQueryInfoImpl();
		JSONObject result = new JSONObject();
		result = businessQueryInfo.businessQueryInfo(request);
		return result;
	}
	/**
	 * 批复查询列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveQueryList(JSONObject request) {
		ApproveQueryListImpl approveQueryList = new ApproveQueryListImpl();
		JSONObject result = new JSONObject();
		result = approveQueryList.approveQueryList(request);
		return result;
	}
	/**
	 * 批复查询详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveDetail(JSONObject request) {
		ApproveDetailImpl approveDetail = new ApproveDetailImpl();
		JSONObject result = new JSONObject();
		result = approveDetail.approveDetail(request);
		return result;
	}
	/**
	 * 综合授信申请详情/分项详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject applyDetaiLineInfo(JSONObject request) {
		ApplyDetaiLineInfoImpl applyDetaiLineInfo = new ApplyDetaiLineInfoImpl();
		JSONObject result = new JSONObject();
		result = applyDetaiLineInfo.applyDetaiLineInfo(request);
		return result;
	}
	/**
	 * 放款审核详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject loadAudioTab(JSONObject request) {
		LoadAudioTabImpl loadAudioTab = new LoadAudioTabImpl();
		JSONObject result = new JSONObject();
		result = loadAudioTab.loadAudioTab(request);
		return result;
	}
	
	/**
	 * 批复查询列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject workFlowQuery(JSONObject request) {
		WorkFlowQueryImpl workFlowQuery = new WorkFlowQueryImpl();
		JSONObject result = new JSONObject();
		result = workFlowQuery.workFlowQuery(request);
		return result;
	}
	/**
	 * 放款流程查询列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject workApproveQuery(JSONObject request) {
		WorkApproveQueryImpl workApproveQuery = new WorkApproveQueryImpl();
		JSONObject result = new JSONObject();
		result = workApproveQuery.workApproveQuery(request);
		return result;
	}
	/**
	 * 单笔单排申请详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject applyDetail(JSONObject request) {
		ApplyDetailImpl applyDetail = new ApplyDetailImpl();
		JSONObject result = new JSONObject();
		result = applyDetail.applyDetail(request);
		return result;
	}
	/**
	 * 查看各级意见列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject opinionList(JSONObject request) {
		OpinionListImpl opinionList = new OpinionListImpl();
		JSONObject result = new JSONObject();
		result = opinionList.opinionList(request);
		return result;
	}
	/**
	 * 查看各级意见详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject opinionEdit(JSONObject request) {
		OpinionEditImpl opinionEdit = new OpinionEditImpl();
		JSONObject result = new JSONObject();
		result = opinionEdit.opinionEdit(request);
		return result;
	}
	/**
	 * 人员休假列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject userLeaveList(JSONObject request) {
		UserLeaveListImpl userLeaveList = new UserLeaveListImpl();
		JSONObject result = new JSONObject();
		result = userLeaveList.userLeaveList(request);
		return result;
	}
	/**
	 * 代办人员列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject assigneeList(JSONObject request) {
		AssigneeListImpl assigneeList = new AssigneeListImpl();
		JSONObject result = new JSONObject();
		result = assigneeList.assigneeList(request);
		return result;
	}
	/**
	 * 获取验证码
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject getRandomCode(JSONObject request) {
		GetRandomCodeImpl getRandomCode = new GetRandomCodeImpl();
		JSONObject result = new JSONObject();
		result = getRandomCode.getRandomCode(request);
		return result;
	}
	/**
	 * 人员休假保存
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject userLeaveSave(JSONObject request) {
		UserLeaveSaveImpl userLeaveSave = new UserLeaveSaveImpl();
		JSONObject result = new JSONObject();
		result = userLeaveSave.userLeaveSave(request);
		return result;
	}
	/**
	 * 被指定代办业务的列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject appointAssigneeList(JSONObject request) {
		AppointAssigneeListImpl appointAssigneeList = new AppointAssigneeListImpl();
		JSONObject result = new JSONObject();
		result = appointAssigneeList.appointAssigneeList(request);
		return result;
	}
	/**
	 * 用户切换（验证码校验）
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject userLeaveIdentCode(JSONObject request) {
		UserLeaveIdentCodeImpl userLeaveIdentCode = new UserLeaveIdentCodeImpl();
		JSONObject result = new JSONObject();
		result = userLeaveIdentCode.userLeaveIdentCode(request);
		return result;
	}
	/**
	 * 业务审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject orleInfo(JSONObject request) {
		OrleInfoImpl orleInfo = new OrleInfoImpl();
		JSONObject result = new JSONObject();
		result = orleInfo.orleInfo(request);
		return result;
	}
	/**
	 * 风险预警业务审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveRiskSignalTaskList(JSONObject request) {
		ApproveRiskSignalTaskListImpl approveRiskSignalTaskList = new ApproveRiskSignalTaskListImpl();
		JSONObject result = new JSONObject();
		result = approveRiskSignalTaskList.approveRiskSignalTaskList(request);
		return result;
	}
	/**
	 * 授信申请业务审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveList(JSONObject request) {
		ApproveListImpl approveList = new ApproveListImpl();
		JSONObject result = new JSONObject();
		result = approveList.approveList(request);
		return result;
	}
	/**
	 * 授信申请业务审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject applyDetaiLine(JSONObject request) {
		ApplyDetaiLineImpl applyDetaiLine = new ApplyDetaiLineImpl();
		JSONObject result = new JSONObject();
		result = applyDetaiLine.applyDetaiLine(request);
		return result;
	}
	/**
	 * 授信申请业务审批详情查看调查报告
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject reportInfo(JSONObject request) {
		ReportInfoImpl reportInfo = new ReportInfoImpl();
		JSONObject result = new JSONObject();
		result = reportInfo.reportInfo(request);
		return result;
	}
	/**
	 * 授信申请业务审批详情签署意见
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject opinionSignInfo(JSONObject request) {
		OpinionSignInfoImpl opinionSignInfo = new OpinionSignInfoImpl();
		JSONObject result = new JSONObject();
		result = opinionSignInfo.opinionSignInfo(request);
		return result;
	}
	/**
	 * 授信申请业务审批详情签署意见指定主审人员
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveAssignList(JSONObject request) {
		ApproveAssignListImpl approveAssignList = new ApproveAssignListImpl();
		JSONObject result = new JSONObject();
		result = approveAssignList.approveAssignList(request);
		return result;
	}
	/**
	 * 授信申请业务审批详情签署意见保存提交
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject opinionSave(JSONObject request) {
		OpinionSaveImpl opinionSave = new OpinionSaveImpl();
		JSONObject result = new JSONObject();
		result = opinionSave.opinionSave(request);
		return result;
	}
	/**
	 * 授信申请业务审批详情签署意见保存提交检查信用评级
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject checkEvaluate(JSONObject request) {
		CheckEvaluateImpl checkEvaluate = new CheckEvaluateImpl();
		JSONObject result = new JSONObject();
		result = checkEvaluate.checkEvaluate(request);
		return result;
	}
	/**
	 * 授信业务审批提交处理阶段列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject phaseList(JSONObject request) {
		PhaseListImpl phaseList = new PhaseListImpl();
		JSONObject result = new JSONObject();
		result = phaseList.phaseList(request);
		return result;
	}
	/**
	 * 授信业务审批提交处理阶段列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject actionList(JSONObject request) {
		ActionListImpl actionList = new ActionListImpl();
		JSONObject result = new JSONObject();
		result = actionList.actionList(request);
		return result;
	}
	/**
	 * 校验公司线授信是否需产品经理介入
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject flowTaskSubmitRole(JSONObject request) {
		FlowTaskSubmitRoleImpl flowTaskSubmitRole = new FlowTaskSubmitRoleImpl();
		JSONObject result = new JSONObject();
		result = flowTaskSubmitRole.flowTaskSubmitRole(request);
		return result;
	}
	/**
	 * 提交操作--获取下阶段信息
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject getNextPhase(JSONObject request) {
		GetNextPhaseImpl getNextPhase = new GetNextPhaseImpl();
		JSONObject result = new JSONObject();
		result = getNextPhase.getNextPhase(request);
		return result;
	}
	/**
	 * 授信业务审批提交
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveSubmit(JSONObject request) {
		ApproveSubmitImpl approveSubmit = new ApproveSubmitImpl();
		JSONObject result = new JSONObject();
		result = approveSubmit.approveSubmit(request);
		return result;
	}
	/**
	 * 放款审核审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject putoutList(JSONObject request) {
		PutoutListImpl putoutList = new PutoutListImpl();
		JSONObject result = new JSONObject();
		result = putoutList.putoutList(request);
		return result;
	}
	/**
	 * 放款审核审批签署意见
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject signOpinionButApply(JSONObject request) {
		SignOpinionButApplyImpl signOpinionButApply = new SignOpinionButApplyImpl();
		JSONObject result = new JSONObject();
		result = signOpinionButApply.signOpinionButApply(request);
		return result;
	}
	/**
	 * 放款审核审批保存意见详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject opinionSaveButApply(JSONObject request) {
		OpinionSaveButApplyImpl opinionSaveButApply = new OpinionSaveButApplyImpl();
		JSONObject result = new JSONObject();
		result = opinionSaveButApply.opinionSaveButApply(request);
		return result;
	}
	/**
	 * 出账要素审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject elementApproveList(JSONObject request) {
		ElementApproveListImpl elementApproveList = new ElementApproveListImpl();
		JSONObject result = new JSONObject();
		result = elementApproveList.elementApproveList(request);
		return result;
	}
	/**
	 * 出账要素审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject elementApproveInfo(JSONObject request) {
		ElementApproveInfoImpl elementApproveInfo = new ElementApproveInfoImpl();
		JSONObject result = new JSONObject();
		result = elementApproveInfo.elementApproveInfo(request);
		return result;
	}
	/**
	 * 提前还款审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject prePayApproveList(JSONObject request) {
		PrePayApproveListImpl prePayApproveList = new PrePayApproveListImpl();
		JSONObject result = new JSONObject();
		result = prePayApproveList.prePayApproveList(request);
		return result;
	}
	/**
	 * 提前还款审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject prePayApproveInfo(JSONObject request) {
		PrePayApproveInfoImpl prePayApproveInfo = new PrePayApproveInfoImpl();
		JSONObject result = new JSONObject();
		result = prePayApproveInfo.prePayApproveInfo(request);
		return result;
	}
	/**
	 * 批复调整审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveReplyList(JSONObject request) {
		ApproveReplyListImpl approveReplyList = new ApproveReplyListImpl();
		JSONObject result = new JSONObject();
		result = approveReplyList.approveReplyList(request);
		return result;
	}
	/**
	 * 批复调整审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveReplyInfo(JSONObject request) {
		ApproveReplyInfoImpl approveReplyInfo = new ApproveReplyInfoImpl();
		JSONObject result = new JSONObject();
		result = approveReplyInfo.approveReplyInfo(request);
		return result;
	}
	/**
	 * 工作方案审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveWorkSchemeList(JSONObject request) {
		ApproveWorkSchemeListImpl approveWorkSchemeList = new ApproveWorkSchemeListImpl();
		JSONObject result = new JSONObject();
		result = approveWorkSchemeList.approveWorkSchemeList(request);
		return result;
	}
	/**
	 * 工作方案审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveWorkSchemeInfo(JSONObject request) {
		ApproveWorkSchemeInfoImpl approveWorkSchemeInfo = new ApproveWorkSchemeInfoImpl();
		JSONObject result = new JSONObject();
		result = approveWorkSchemeInfo.approveWorkSchemeInfo(request);
		return result;
	}
	/**
	 * 工作方案审批签署意见和查看意见
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveWorkSchemeOpinion(JSONObject request) {
		ApproveWorkSchemeOpinionImpl approveWorkSchemeOpinion = new ApproveWorkSchemeOpinionImpl();
		JSONObject result = new JSONObject();
		result = approveWorkSchemeOpinion.approveWorkSchemeOpinion(request);
		return result;
	}
	/**
	 * 工作方案审批意见保存提交
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveWorkSchemeSubmitCheck(JSONObject request) {
		ApproveWorkSchemeSubmitCheckImpl approveWorkSchemeSubmitCheck = new ApproveWorkSchemeSubmitCheckImpl();
		JSONObject result = new JSONObject();
		result = approveWorkSchemeSubmitCheck.approveWorkSchemeSubmitCheck(request);
		return result;
	}
	/**
	 * 工作方案审批意见保存提交获取下一步用户
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveWorkSchemeUserList(JSONObject request) {
		ApproveWorkSchemeUserListImpl approveWorkSchemeUserList = new ApproveWorkSchemeUserListImpl();
		JSONObject result = new JSONObject();
		result = approveWorkSchemeUserList.approveWorkSchemeUserList(request);
		return result;
	}
	/**
	 * 工作方案审批提交动作
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveWorkSchemeSubmit(JSONObject request) {
		ApproveWorkSchemeSubmitImpl approveWorkSchemeSubmit = new ApproveWorkSchemeSubmitImpl();
		JSONObject result = new JSONObject();
		result = approveWorkSchemeSubmit.approveWorkSchemeSubmit(request);
		return result;
	}
	/**
	 * 放款规模审批列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveScaleList(JSONObject request) {
		ApproveScaleListImpl approveScaleList = new ApproveScaleListImpl();
		JSONObject result = new JSONObject();
		result = approveScaleList.approveScaleList(request);
		return result;
	}
	/**
	 * 放款规模审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveScaleInfo(JSONObject request) {
		ApproveScaleInfoImpl approveScaleInfo = new ApproveScaleInfoImpl();
		JSONObject result = new JSONObject();
		result = approveScaleInfo.approveScaleInfo(request);
		return result;
	}
	/**
	 * 放款规模审批详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject steptypeCode(JSONObject request) {
		SteptypeCodeImpl steptypeCode = new SteptypeCodeImpl();
		JSONObject result = new JSONObject();
		result = steptypeCode.steptypeCode(request);
		return result;
	}
	/**
	 * 放款规模审批详情修改利率增量联动更新操作
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveScaleInfoUpdateRate(JSONObject request) {
		ApproveScaleInfoUpdateRateImpl approveScaleInfoUpdateRate = new ApproveScaleInfoUpdateRateImpl();
		JSONObject result = new JSONObject();
		result = approveScaleInfoUpdateRate.approveScaleInfoUpdateRate(request);
		return result;
	}
	/**
	 * 贷后报告列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectList(JSONObject request) {
		CustomerInspectListImpl customerInspectList = new CustomerInspectListImpl();
		JSONObject result = new JSONObject();
		result = customerInspectList.customerInspectList(request);
		return result;
	}
	/**
	 * 贷后报告新增--报告频率code
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectAddApply(JSONObject request) {
		CustomerInspectAddApplyImpl customerInspectAddApply = new CustomerInspectAddApplyImpl();
		JSONObject result = new JSONObject();
		result = customerInspectAddApply.customerInspectAddApply(request);
		return result;
	}
	/**
	 * 贷后报告新增--选择客户
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectSelectCustomer(JSONObject request) {
		CustomerInspectSelectCustomerImpl customerInspectSelectCustomer = new CustomerInspectSelectCustomerImpl();
		JSONObject result = new JSONObject();
		result = customerInspectSelectCustomer.customerInspectSelectCustomer(request);
		return result;
	}
	/**
	 * 贷后报告新增--保存,详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectInit(JSONObject request) {
		CustomerInspectInitImpl customerInspectInit = new CustomerInspectInitImpl();
		JSONObject result = new JSONObject();
		result = customerInspectInit.customerInspectInit(request);
		return result;
	}
	/**
	 * 贷后报告影像资料树图列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectPhotoTree(JSONObject request) {
		CustomerInspectPhotoTreeImpl customerInspectPhotoTree = new CustomerInspectPhotoTreeImpl();
		JSONObject result = new JSONObject();
		result = customerInspectPhotoTree.customerInspectPhotoTree(request);
		return result;
	}
	/**
	 * 贷后报告影像资料缩率图列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectPhotoChild(JSONObject request) {
		CustomerInspectPhotoChildImpl customerInspectPhotoChild = new CustomerInspectPhotoChildImpl();
		JSONObject result = new JSONObject();
		result = customerInspectPhotoChild.customerInspectPhotoChild(request);
		return result;
	}
	/**
	 * 贷后报告影像资料删除
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalAttachmentPicDelete(JSONObject request) {
		RiskSignalAttachmentPicDeleteImpl riskSignalAttachmentPicDelete = new RiskSignalAttachmentPicDeleteImpl();
		JSONObject result = new JSONObject();
		result = riskSignalAttachmentPicDelete.riskSignalAttachmentPicDelete(request);
		return result;
	}
	/**
	 * 贷后报告影像资料上传影像节点选择
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalLoanList(JSONObject request) {
		RiskSignalLoanListImpl riskSignalLoanList = new RiskSignalLoanListImpl();
		JSONObject result = new JSONObject();
		result = riskSignalLoanList.riskSignalLoanList(request);
		return result;
	}
	/**
	 * 风险预警列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalApplyList(JSONObject request) {
		RiskSignalApplyListImpl riskSignalApplyList = new RiskSignalApplyListImpl();
		JSONObject result = new JSONObject();
		result = riskSignalApplyList.riskSignalApplyList(request);
		return result;
	}
	/**
	 * 风险预警详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalApplyInfo(JSONObject request) {
		RiskSignalApplyInfoImpl riskSignalApplyInfo = new RiskSignalApplyInfoImpl();
		JSONObject result = new JSONObject();
		result = riskSignalApplyInfo.riskSignalApplyInfo(request);
		return result;
	}
	/**
	 * 风险预警详情-客户选择
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalApplySelectCustomer(JSONObject request) {
		RiskSignalApplySelectCustomerImpl riskSignalApplySelectCustomer = new RiskSignalApplySelectCustomerImpl();
		JSONObject result = new JSONObject();
		result = riskSignalApplySelectCustomer.riskSignalApplySelectCustomer(request);
		return result;
	}
	/**
	 * 风险预警详情-信号选择
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalApplySelectRisk(JSONObject request) {
		RiskSignalApplySelectRiskImpl riskSignalApplySelectRisk = new RiskSignalApplySelectRiskImpl();
		JSONObject result = new JSONObject();
		result = riskSignalApplySelectRisk.riskSignalApplySelectRisk(request);
		return result;
	}
	/**
	 * 风险预警详情-保存
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalApplySave(JSONObject request) {
		RiskSignalApplySaveImpl riskSignalApplySave = new RiskSignalApplySaveImpl();
		JSONObject result = new JSONObject();
		result = riskSignalApplySave.riskSignalApplySave(request);
		return result;
	}
	/**
	 * 风险预警详情-附件列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalAttachmentList(JSONObject request) {
		RiskSignalAttachmentListImpl riskSignalAttachmentList = new RiskSignalAttachmentListImpl();
		JSONObject result = new JSONObject();
		result = riskSignalAttachmentList.riskSignalAttachmentList(request);
		return result;
	}
	/**
	 * 风险预警详情-上传附件
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalAttachmentUpLoad(JSONObject request) {
		RiskSignalAttachmentUpLoadImpl riskSignalAttachmentUpLoad = new RiskSignalAttachmentUpLoadImpl();
		JSONObject result = new JSONObject();
		result = riskSignalAttachmentUpLoad.riskSignalAttachmentUpLoad(request);
		return result;
	}
	/**
	 * 风险预警详情-附件删除
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskSignalAttachmentDelete(JSONObject request) {
		RiskSignalAttachmentDeleteImpl riskSignalAttachmentDelete = new RiskSignalAttachmentDeleteImpl();
		JSONObject result = new JSONObject();
		result = riskSignalAttachmentDelete.riskSignalAttachmentDelete(request);
		return result;
	}
	/**
	 * 风险分类认定树图
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveClassifyTaskTree(JSONObject request) {
		ApproveClassifyTaskTreeImpl approveClassifyTaskTree = new ApproveClassifyTaskTreeImpl();
		JSONObject result = new JSONObject();
		result = approveClassifyTaskTree.approveClassifyTaskTree(request);
		return result;
	}
	/**
	 * 风险分类认定列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveClassifyTaskList(JSONObject request) {
		ApproveClassifyTaskListImpl approveClassifyTaskList = new ApproveClassifyTaskListImpl();
		JSONObject result = new JSONObject();
		result = approveClassifyTaskList.approveClassifyTaskList(request);
		return result;
	}
	/**
	 * 风险分类认定详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveClassifyTaskInfo(JSONObject request) {
		ApproveClassifyTaskInfoImpl approveClassifyTaskInfo = new ApproveClassifyTaskInfoImpl();
		JSONObject result = new JSONObject();
		result = approveClassifyTaskInfo.approveClassifyTaskInfo(request);
		return result;
	}
	/**
	 * 风险分类认定保存提交
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject riskClassifySaveOpinion(JSONObject request) {
		RiskClassifySaveOpinionImpl riskClassifySaveOpinion = new RiskClassifySaveOpinionImpl();
		JSONObject result = new JSONObject();
		result = riskClassifySaveOpinion.riskClassifySaveOpinion(request);
		return result;
	}
	/**
	 * 风险分类认定批量提交选择用户
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject ApproveClassifyTaskUserList(JSONObject request) {
		ApproveClassifyTaskUserListImpl ApproveClassifyTaskUserList = new ApproveClassifyTaskUserListImpl();
		JSONObject result = new JSONObject();
		result = ApproveClassifyTaskUserList.ApproveClassifyTaskUserList(request);
		return result;
	}
	/**
	 * 风险分类认定批量提交
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveClassifyTaskSubmit(JSONObject request) {
		ApproveClassifyTaskSubmitImpl approveClassifyTaskSubmit = new ApproveClassifyTaskSubmitImpl();
		JSONObject result = new JSONObject();
		result = approveClassifyTaskSubmit.approveClassifyTaskSubmit(request);
		return result;
	}
	/**
	 * 利率查询
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject rateQuery(JSONObject request) {
		RateQueryImpl rateQuery = new RateQueryImpl();
		JSONObject result = new JSONObject();
		result = rateQuery.rateQuery(request);
		return result;
	}
	/**
	 * 公告列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject noteList(JSONObject request) {
		NoteListImpl noteList = new NoteListImpl();
		JSONObject result = new JSONObject();
		result = noteList.noteList(request);
		return result;
	}
	/**
	 * 公告详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject noteDetail(JSONObject request) {
		NoteDetailImpl noteDetail = new NoteDetailImpl();
		JSONObject result = new JSONObject();
		result = noteDetail.noteDetail(request);
		return result;
	}
	/**
	 * 备忘录列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject memoList(JSONObject request) {
		MemoListImpl memoList = new MemoListImpl();
		JSONObject result = new JSONObject();
		result = memoList.memoList(request);
		return result;
	}
	/**
	 * 备忘录新增
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject memoEdit(JSONObject request) {
		MemoEditImpl memoEdit = new MemoEditImpl();
		JSONObject result = new JSONObject();
		result = memoEdit.memoEdit(request);
		return result;
	}
	/**
	 * 备忘录详情保存
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject memoSave(JSONObject request) {
		MemoSaveImpl memoSave = new MemoSaveImpl();
		JSONObject result = new JSONObject();
		result = memoSave.memoSave(request);
		return result;
	}
	/**
	 * 备忘录详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject memoDetail(JSONObject request) {
		MemoDetailImpl memoDetail = new MemoDetailImpl();
		JSONObject result = new JSONObject();
		result = memoDetail.memoDetail(request);
		return result;
	}
	/**
	 * 备忘录更新
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject memoUpdate(JSONObject request) {
		MemoUpdateImpl memoUpdate = new MemoUpdateImpl();
		JSONObject result = new JSONObject();
		result = memoUpdate.memoUpdate(request);
		return result;
	}
	/**
	 * 备忘录删除
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject memoDelete(JSONObject request) {
		MemoDeleteImpl memoDelete = new MemoDeleteImpl();
		JSONObject result = new JSONObject();
		result = memoDelete.memoDelete(request);
		return result;
	}
	/**
	 * 退回前一步
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject backStep(JSONObject request) {
		BackStepImpl backStep = new BackStepImpl();
		JSONObject result = new JSONObject();
		result = backStep.backStep(request);
		return result;
	}
	/**
	 * 原批复详情
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject approveOldDetail(JSONObject request) {
		ApproveOldDetailImpl approveOldDetail = new ApproveOldDetailImpl();
		JSONObject result = new JSONObject();
		result = approveOldDetail.approveOldDetail(request);
		return result;
	}
	/**
	 * 放款审核收回
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject takeBack(JSONObject request) {
		TakeBackImpl takeBack = new TakeBackImpl();
		JSONObject result = new JSONObject();
		result = takeBack.takeBack(request);
		return result;
	}
	/**
	 * 集团授信公司授信列表
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject applyList(JSONObject request) {
		ApplyListImpl applyList = new ApplyListImpl();
		JSONObject result = new JSONObject();
		result = applyList.applyList(request);
		return result;
	}
	/**
	 * 贷后检查报告上传附件(IOS)
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject attachmentUploadImage(JSONObject request) {
		AttachmentUploadImageImpl attachmentUploadImage = new AttachmentUploadImageImpl();
		JSONObject result = new JSONObject();
		result = attachmentUploadImage.attachmentUploadImage(request);
		return result;
	}
	/**
	 * 调查报告（新增保存客户调查报告）(IOS)
	 * @param request
	 * @return
	 * @throws HandlerException
	 */
	@SuppressWarnings("deprecation")
	public JSONObject customerInspectInit2(JSONObject request) {
		CustomerInspectInitImpl2 customerInspectInit2 = new CustomerInspectInitImpl2();
		JSONObject result = new JSONObject();
		result = customerInspectInit2.customerInspectInit2(request);
		return result;
	}
}
