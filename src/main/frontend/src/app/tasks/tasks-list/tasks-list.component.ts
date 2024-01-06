import { Component, OnInit } from '@angular/core';
import {Task} from "../task.module";
import {NgClass, NgForOf} from "@angular/common";
import {TaskService} from "../task.service";

@Component({
  selector: 'app-tasks-list',
  standalone: true,
  imports: [
    NgForOf,
    NgClass
  ],
  templateUrl: './tasks-list.component.html',
  styleUrl: './tasks-list.component.css'
})
export class TasksListComponent implements OnInit{
  constructor(private taskService: TaskService) {
  }
  ngOnInit() {
    return this.taskService.getTasks()
      .subscribe((tasks: any[]) => {this.tasks = tasks},
        (error) => console.log(error))
  }
  tasks: Task[] = []

  onTaskChange($event: Event, task: Task) {
    console.log('Task has changed.')
  }

  getDeadlineLabel(task: Task) {
    return task.isDone ? 'label-success' : 'label-primary';
  }
}
