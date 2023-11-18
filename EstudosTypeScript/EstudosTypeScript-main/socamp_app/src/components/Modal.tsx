import React, {ReactElement}  from 'react';
import styles from './Modal.module.css'



interface Props {
  children: React.ReactNode 
}

const Modal = ({children}: Props)=>{
  
  return (
    <div id="modal">
      <div className={styles.fade}>

      </div>
      <div className={styles.modal}>
          {children}
      </div>
       

    </div>
  );
  
}

export default Modal