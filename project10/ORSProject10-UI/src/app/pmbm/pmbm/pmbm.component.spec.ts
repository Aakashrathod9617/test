import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PmbmComponent } from './pmbm.component';

describe('PmbmComponent', () => {
  let component: PmbmComponent;
  let fixture: ComponentFixture<PmbmComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PmbmComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PmbmComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
