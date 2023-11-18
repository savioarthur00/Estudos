import { Request, Response } from "express";
import { BalancoModel } from "../models/Balanco";
import Logger from "../../config/logger";

export async function createBalanco(req: Request, res: Response) {
  try {
    const data = req.body;
    const balanco = await BalancoModel.create(data);
    return res.status(201).json(balanco);
  } catch (e: any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
    }
}


export async function findBalancoById(req: Request, res: Response) {
  try {
    const id = req.params.id;
    const balanco = await BalancoModel.findById(id);

    if (!balanco) {
      return res.status(404).json({ error: "Balanço não existe." });
      
    }

    return res.status(200).json(balanco);
  } catch (e: any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}

export async function getAllBalanco(req:Request,res:Response){

  try {    
    const balancos = await BalancoModel.find()
    return res.status(200).json(balancos)
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }

}

export async function removeBalanco(req:Request,res:Response){

  try {
    
    const id = req.params.id
    const balanco = await BalancoModel.findById(id);

    if(!balanco){
      return res.status(404).json({error: "O balanço não existe, tente novamente"})
    }
    await balanco.deleteOne()
    
    return res.status(200).json({msg: "Balanço deletado com sucesso!"})
    
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}

export async function updateBalanco(req:Request,res:Response){

  try {
    const id = req.params.id
    const data = req.body
    const balanco = await BalancoModel.findById(id);

    if(!balanco){
      return res.status(404).json({error: "O  balanço buscado não existe, tente novamente"})
    }
    
    await BalancoModel.updateOne({_id: id},data)
    return res.status(200).json(data)
    
    
  } catch (e:any) {
    Logger.error(`Erro no sistema: ${e.message}`);
    return res.status(500).json({error: "Por favor, tente mais tarde"});
  }
}