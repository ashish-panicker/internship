
import { Employee, Batch } from './Employee';

let emp = new Employee();
emp.firstName = 'Ashish';
emp.lastName = 'S';
emp.display();

let batch = new Batch();
batch.employees.push(emp);