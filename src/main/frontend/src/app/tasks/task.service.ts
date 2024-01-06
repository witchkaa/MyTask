import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";
import {Observable} from "rxjs";
import {Task} from "./task.module";
@Injectable({providedIn: 'root'})
export class TaskService {
  constructor(private http: HttpClient) {
  }
  getTasks(): Observable<any[]> {
    return this.http.get<any[]>('/api/tasks/');
  }
  saveTask(task: Task, checked: boolean) {
    task.isDone = checked;
    return this.http.post('/api/tasks/new', task);
  }
  addTask(task: Task) {
    return this.http.post('/api/tasks/new', task);
  }
}
