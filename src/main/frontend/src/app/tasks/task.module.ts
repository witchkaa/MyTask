
export class Task {
  public id: number;
  public name: string;
  public deadline: string;
  public isDone: boolean;
  constructor(id: number, name: string, deadline: string, isDone: boolean) {
    this.id = id;
    this.name = name;
    this.deadline = deadline;
    this.isDone = isDone;
  }
}
