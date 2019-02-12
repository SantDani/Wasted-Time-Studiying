import {Subject} from '../subject/Subject';

export class Student{
    id: number;
    name: string;
    subjectList?: Subject[];
    dni: string;
}