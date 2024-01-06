import { Component } from '@angular/core';
import {TaskService} from "../task.service";
import {Task} from "../task.module";

@Component({
  selector: 'app-tasks-add',
  standalone: true,
  imports: [],
  templateUrl: './tasks-add.component.html',
  styleUrl: './tasks-add.component.css'
})
export class TasksAddComponent {

  constructor(private taskService: TaskService) {

  }

  onTaskAdd($event: Event) {
    let task: Task = new Task(event.target.value, this.getTodayAsString(), false);
    this.taskService.addTask(task);
  }
}
