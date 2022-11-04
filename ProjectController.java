package projectRepo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import projectRepo.model.Employee;
import projectRepo.model.EmployeeStatus;
import projectRepo.model.Emprepo;
import projectRepo.model.Project;
import projectRepo.model.ProjectStatus;
import projectRepo.model.Projectrepo;
import projectRepo.model.Subtask;
import projectRepo.model.SubtaskStatus;
import projectRepo.model.Subteam;
import projectRepo.model.SubteamStatus;
import projectRepo.model.Team;
import projectRepo.model.TeamStatus;
import projectRepo.model.extra.DeptNameWithCount;
import projectRepo.model.extra.Empid;
import projectRepo.model.extra.EmpidNameTeam;
import projectRepo.model.extra.EmployeeAndStatus;
import projectRepo.model.extra.ProjectStatesWithCount;
import projectRepo.model.extra.STeamTeamProjectId;
import projectRepo.model.extra.SubteamIdAndTeamId;
import projectRepo.model.extra.TeamIdAndProjectId;
import projectRepo.service.DepartmentService;
import projectRepo.service.EmployeeService;
import projectRepo.service.EmprepoService;
import projectRepo.service.ProjectService;
import projectRepo.service.ProjectrepoService;
import projectRepo.service.SubtaskService;
import projectRepo.service.SubteamService;
import projectRepo.service.TeamService;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class ProjectController {
	
	
	@Autowired
	private EmployeeService employeeService;
	//Employee methods
	@GetMapping("/getallEmployee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAll();
	}
	@GetMapping("/getEmpByTeamID")
	public List<Employee> getAllEmpByTeamId(@RequestParam int teamid){
		return employeeService.getAllbyTeamId(teamid);
	}
	@GetMapping("/getAllIdleEmp")
	public List<Employee> getAllIdleEmp(){
		return employeeService.getAllidleEmployee();
	}
	@PostMapping("/addEmployee")
	public EmployeeStatus addEmployee(@RequestBody Employee e) {
		return employeeService.addEmployee(e);
	}
	@PutMapping("/updateEmployee")
	public EmployeeStatus updateEmployee(@RequestBody Employee e) {
		return employeeService.updateEmployee(e);
	}
	@PostMapping("/selectedEmplistforsteam/{sid}")
	public EmployeeStatus selectedEmplistforsteam(@RequestBody List<Empid> empids, @PathVariable Integer sid) {
		return employeeService.updateEmployeeSubteamid(empids, sid);
	}
	@GetMapping("/getAllEmpTeamIdNotNull")
	public List<EmpidNameTeam> getAllEmpTeamIdNotNull() {
		return employeeService.getAllEmployeesHavingTeamId();
	}
	@PostMapping("/selectedEmplistforteam")
	public EmployeeStatus selectedEmplistforteam(@RequestBody List<Empid> empids) {
		return employeeService.updateEmployeeAndCreateTeam(empids);
	}
	@GetMapping("/getCountAllEmployeeAndStatus")
	public List<EmployeeAndStatus> getCountAllEmployeeAndStatus(){
		return employeeService.getCountEmployeeBytype();
	}
	
	
	
	@Autowired
	private SubteamService subteamService;
	//Subteam methods
	@GetMapping("/getallSubteam")
	public List<Subteam> getsubteam(){
		return subteamService.getAll();
	}
	@PostMapping("/addSubteam")
	public SubteamStatus addSubteam(@RequestBody Subteam s) {
		return subteamService.addSubteam(s);
	}
	@GetMapping("/getMaxSubteamId")
	public int getMaxSubteamId() {
		return subteamService.getMaxSubteamId();
	}
	@GetMapping("/getAllSubteamAndTeamId")
	public List<SubteamIdAndTeamId> getAllSubteamAndTeamId(){
		return subteamService.getAllTeamAndSubteamId(); 
	}
	@GetMapping("/getAllSubteamTeamIdProjectId")
	public List<STeamTeamProjectId> getAllSubteamTeamIdProjectId(){
		return subteamService.getSteamTeamPid();
	}
	
	
	
	@Autowired
	private SubtaskService subtaskService;
	//Subtask methods
	@GetMapping("/getallSubtask")
	public List<Subtask> getsubtask(){
		return subtaskService.getAll();
	}
	@PostMapping("/addSubtask")
	public SubtaskStatus addSubtask(@RequestBody Subtask s) {
		return subtaskService.addSubtask(s);
	}
	@GetMapping("/getMaxSubtaskId")
	public int getMaxSubtaskId() {
		return subtaskService.getMaxSubtaskId();
	}
	
	
	
	@Autowired
	private ProjectService projectService;
	//project methods
	@GetMapping("/getallProject")
	public List<Project> getproject(){
		return projectService.getAll();
	}
	@PutMapping("/updateProject")
	public ProjectStatus updateProject(@RequestBody Project p) {
		return projectService.updateProject(p);
	}
	
	@GetMapping("/getByProjectId")
	public Project findbyprojectid(int projectid) {
		return projectService.findbyprojectid(projectid);
	}
	@GetMapping("/getAllonholdProject")
	public List<Project> getAllonholdProject(){
		return projectService.getAllonholdProject();
	}
	@GetMapping("/getAllactiveProject")
	public List<Project> getAllactiveProject(){
		return projectService.getAllactiveProject();
	}
	@PostMapping("/addProject")
	public ProjectStatus addproject(@RequestBody Project p) {
		return projectService.addProject(p);
	}
	@GetMapping("/getUnallocatedProjects")
    public List<Project> getUnallocatedProjects(){
        return projectService.getAllUnallocatedProject();
    }
	@PutMapping("/updateUnallocatedProjects")
	public ProjectStatus updateProjectStatus(@RequestParam Integer pid) {
		return projectService.updateProjectStatus(pid);
	}
	@GetMapping("/getMaxProjectId")
	public int getMaxProjectId() {
		return projectService.getMaxProjectIDIncremented();
	}
	@GetMapping("/getStatesWithCount")
	public List<ProjectStatesWithCount> getStateWithCount(){
		return projectService.getAllCategoryWithStates();
	}
	
	@DeleteMapping("/deleteProject")
	public ProjectStatus deleteProject(@RequestParam int delete) {
		return projectService.deleteProject(delete);
	}
	
	
	
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/getDeptProjectCounts")
	public List<DeptNameWithCount> getDeptWithCounts(){
		return departmentService.getAllDepartmentWithCount();
	}
	@GetMapping("/getDeptProjectrepoCounts")
	public List<DeptNameWithCount> getDeptprojWithCounts(){
		return departmentService.getAllDepartmentproWithCount();
	}
	
	
	
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/getAllTeam")
	public List<Team> getAllTeam(){
		return teamService.getAll();
	}
	
	@GetMapping("/getUnallocatedTeams")
	public List<Team> getUnallocatedTeams(){
		Integer pid=null;
		return teamService.getUnallocatedTeam(pid);
	}
	
	@PutMapping("/updateUnallocatedTeam")
	public TeamStatus updateUnallocatedTeam(@RequestParam Integer pid,@RequestParam Integer tid) {
		return teamService.updatePidByTid(pid, tid);
	}
	@GetMapping("/getAllActiveProjectAndTeamId")
	public List<TeamIdAndProjectId> getActiveTeamAndProjectId(){
		return teamService.getAllActiveTeamAndProjectId();
	}
	@PostMapping("/addTeam")
	public TeamStatus addNewTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
	}
	
	@Autowired
	private ProjectrepoService projectrepoService;
	
	@GetMapping("/getAllProjectrepo")
	public List<Projectrepo> getProjectRepo(){
		return projectrepoService.getAllProjectRepo();
	}
	
	@Autowired
	private EmprepoService emprepoService;
	
	@GetMapping("/getAllEmprepo")
	public List<Emprepo> getEmprepo(){
		return emprepoService.getAllEmprepo();
	}
}