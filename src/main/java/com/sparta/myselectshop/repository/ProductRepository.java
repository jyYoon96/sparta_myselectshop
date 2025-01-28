package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findAllByUser(User user, Pageable pageable);

    Page<Product> findAllByUserAndProductFolderList_FolderId(User user, Long folderId, Pageable pageable);
//    select p.id, p.title, pf.product_id, pf.folder_id from product p leftjoin product_folder pf
//        on p.id = pf.product_id
//    where p.user_id = ?
//        and pf.folder_id = ?
//    order By p.id
//      limit 0, 10;

}
