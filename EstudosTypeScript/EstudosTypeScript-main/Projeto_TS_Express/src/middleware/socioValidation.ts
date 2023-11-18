import {body} from "express-validator"

export const socioCreateValidation = () =>{
    return [
        body("name").isString().withMessage("O nome do sócio é obrigatório"),
        body("forma_pagamento").isString().withMessage("A forma de pagamento é obrigatória"),
        

    ]
}